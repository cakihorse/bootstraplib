import requests

class XSTSAuth:
    XSTS_AUTH_URL = "https://xsts.auth.xboxlive.com/xsts/authorize"
    
    def __init__(self, xbl_token: str):
        self.xbl_token = xbl_token
        self.xsts_token = None
        self.user_hash = None
    
    def authenticate_with_xsts(self):
        """Authentifie l'utilisateur auprès du service XSTS."""
        payload = {
            "Properties": {
                "SandboxId": "RETAIL",
                "UserTokens": [self.xbl_token]
            },
            "RelyingParty": "rp://api.minecraftservices.com/",
            "TokenType": "JWT"
        }
        
        response = requests.post(self.XSTS_AUTH_URL, json=payload)
        if response.status_code != 200:
            raise Exception(f"Failed to authenticate with XSTS: {response.text}")
        
        data = response.json()
        self.xsts_token = data.get("Token")
        
        # Extraction du User Hash (uhs)
        display_claims = data.get("DisplayClaims", {})
        xui = display_claims.get("xui", [{}])
        self.user_hash = xui[0].get("uhs")
        
        if not self.user_hash:
            raise Exception("Failed to extract User Hash (uhs) from XSTS response")
        
        return self.xsts_token, self.user_hash

# Exemple d'utilisation
if __name__ == '__main__':
    xbl_token = "TON_XBL_TOKEN"
    xsts_auth = XSTSAuth(xbl_token)
    try:
        xsts_token, user_hash = xsts_auth.authenticate_with_xsts()
        print("XSTS Token:", xsts_token)
        print("User Hash:", user_hash)
    except Exception as e:
        print(e)
