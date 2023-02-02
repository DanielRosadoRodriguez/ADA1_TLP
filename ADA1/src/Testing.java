public class Testing {
    public static void main(String[] args) {
        String infixPath = args[0];
        DAO dao = new DAO(infixPath);
        dao.readFile();


    }
}
