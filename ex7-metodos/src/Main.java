public class Main {
    public static void main(String[] args) {
        String c = "c:\\user\\john";
        String ree = c.replace('\\','/');
                if (ree.startsWith("c:/")){
                    ree = ree.substring(2);
                }
        System.out.println(ree);
    }
}