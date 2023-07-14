package fr.cakihorse.bootstraplib;

public class Example {
    public static void main(String[] args) {


    String fileName = "echocraft.jar";
    String fileUrl = "https://github.com/cakihorse/echocraft/releases/download/V1.2/echocraft.jar";
    String outPutPath = "C:\\Users\\PROPRIETAIRE\\Desktop" + "\\" + fileName; //Only modify "yourpath" !!

    Frame.newWindow("ExampleWindow", 700, 720, true, false, true, "src/main/resources/bg.jpg");
    Download.start(fileUrl, outPutPath);
    Launch.start(outPutPath, false);

    }
}