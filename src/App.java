/**
 * @author : 조재철
 * @since 1.0
 */
public class App {

    public static void main(String[] args) {
        ClassLoader classLoader = App.class.getClassLoader();

        System.out.println(classLoader);
        System.out.println(classLoader.getParent());
        System.out.println(classLoader.getParent().getParent());
    }
}
