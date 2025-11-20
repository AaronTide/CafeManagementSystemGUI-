
import javax.swing.SwingUtilities;
import model.*;
import view.CafeView;
import controller.CafeController;

public class CafeManagementSystemMVC {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Menu menu = new Menu();
            CafeView view = new CafeView();
            new CafeController(menu, view);
        });
    }
}






