import org.jasn1.compiler.Compiler;

import org.junit.Test;


public class TestCompiler {
    private static final String generatedSrcDir = "src/main/java";
    private static final String rootPackageName = "org.jasn1.compiler";




    @Test
    public void testCompiling() throws Exception {

                String path = "C:/Users/datarox/IdeaProjects/JASN1Compiler/src/main/resources/compile-test.asn";
        Compiler.inferredSchema(path);

    }






}
