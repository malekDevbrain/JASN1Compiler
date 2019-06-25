import org.jasn1.compiler.Compiler;
import org.junit.Test;

public class TestCompiler {
    private static final String generatedSrcDir = "C:/Users/datarox/IdeaProjects/JASN1Compiler/src/main/Java-generated-Classes";
    private static final String rootPackageName = "org.jasn1.compiler";
    String[] args;

    // @Test
    // public void testCompilingEmbeddedPdv() throws Exception {
    // args = new String[] { "-o", "../jasn1/src/main/java/", "-p", "org.openmuc.jasn1.ber", "-f",
    // "src/test/resources/embedded-pdv.asn" };
    // Compiler.main(args);
    // }

    @Test
    public void testCompiling() throws Exception {
        args = new String[] { "-o", generatedSrcDir, "-p", rootPackageName, "-f",
                "C:/Users/datarox/IdeaProjects/JASN1Compiler/src/main/resources/compile-test.asn" };
        Compiler.main(args);
    }

}
