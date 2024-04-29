package fr.btssio.ksav_admin;

import fr.btssio.ksav_admin.controllers.Controller;
import fr.btssio.ksav_admin.controllers.HomeController;
import fr.btssio.ksav_admin.views.Window;
import java.awt.Toolkit;

public class KSAV_Admin {

    public static void main(String[] args) {
        Window window = new Window("KSAV Admin");
        window.setIconImage(Toolkit.getDefaultToolkit().getImage(KSAV_Admin.class.getResource("/images/icon.png")));
        Controller.show(window, HomeController.class);
    }
}
