package Terceiro_Periodo.func_uteis;

public class FindFile {
    private static String absoluteDirectory = "C:\\Users\\igors\\IdeaProjects\\Faculdade\\src";
    private static String mainPackage;
    private static String subPackage = "";
    private static String fileName;
    private static boolean isSubPackageExist = false;

    public FindFile(String mainPackage, String fileName) {
        this.mainPackage = mainPackage;
        this.fileName = fileName;
    }


    public FindFile(String mainPackage, String subPackage, String fileName) {
        this.mainPackage = mainPackage;
        this.subPackage = subPackage;
        this.fileName = fileName;
        isSubPackageExist = true;
    }


    public static void main(String[] args) {
        FindFile findFile = new FindFile("func_uteis", "FindFile");
        String tst = findFile.getAbsolueFilePath("java");
        System.out.println(tst);
    }


    public String getAbsoluteDirectory() {
        return absoluteDirectory;
    }


    public String getAbsolueFilePath(String typeOfFile) {
        String restOfPath = "";

        if (isSubPackageExist) { //Verificando se tem subPackage
            restOfPath = "\\" + subPackage;
        }

        return absoluteDirectory + "\\" + mainPackage + subPackage + "\\" + fileName + "." + typeOfFile;
    }
}
