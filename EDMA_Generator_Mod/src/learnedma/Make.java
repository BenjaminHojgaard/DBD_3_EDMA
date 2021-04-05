package learnedma;

import org.abstractica.edma.generator.EdmaGenerator;

public class Make {
    public static void main(String[] args) {
        String projectDir = "C:\\Users\\Travel\\Desktop\\School\\DB\\EDMA\\Learn_EDMA";
        EdmaGenerator generator = new EdmaGenerator("LearnEDMA", projectDir +  "/edmasrc", projectDir + "/src", "learnedma");
        generator.make();
    }
}