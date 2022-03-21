module ca.bcit.comp2522.javafx.javafxexamples {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires java.desktop;
    requires javafx.media;

    opens ca.bcit.comp2522.javafx.javafxexamples to javafx.fxml;
    exports ca.bcit.comp2522.javafx.javafxexamples;

    exports ca.bcit.comp2522.javafx.javafxexamples.step_01_hello_world;
    opens ca.bcit.comp2522.javafx.javafxexamples.step_01_hello_world to javafx.fxml;

    exports ca.bcit.comp2522.javafx.javafxexamples.step_02_basic_shapes;
    opens ca.bcit.comp2522.javafx.javafxexamples.step_02_basic_shapes to javafx.fxml;

    exports ca.bcit.comp2522.javafx.javafxexamples.step_03_layouts;
    opens ca.bcit.comp2522.javafx.javafxexamples.step_03_layouts to javafx.fxml;

    exports ca.bcit.comp2522.javafx.javafxexamples.step_04_events_part_1;
    opens ca.bcit.comp2522.javafx.javafxexamples.step_04_events_part_1 to javafx.fxml;

    exports ca.bcit.comp2522.javafx.javafxexamples.step_05_fonts;
    opens ca.bcit.comp2522.javafx.javafxexamples.step_05_fonts to javafx.fxml;

    exports ca.bcit.comp2522.javafx.javafxexamples.step_06_fun_controls;
    opens ca.bcit.comp2522.javafx.javafxexamples.step_06_fun_controls to javafx.fxml;

    exports ca.bcit.comp2522.javafx.javafxexamples.step_07_animation;
    opens ca.bcit.comp2522.javafx.javafxexamples.step_07_animation to javafx.fxml;
}