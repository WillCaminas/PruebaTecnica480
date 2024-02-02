
public class Main {
    public static final String PATTERN_SEPARATOR = "---------------------";
    public static void main(String[] args) {
        CD cd = new CD("CD Personal Music", "512MB", 500);
        HardDisk hdd = new HardDisk("Hard DISK K:", "1TB", 7200);
        cd.spin();
        System.out.println(PATTERN_SEPARATOR);
        cd.saveData("lofi_code.mp3");
        System.out.println(PATTERN_SEPARATOR);
        cd.writeBy();
        System.out.println(PATTERN_SEPARATOR);
        cd.readBy();
        System.out.println(PATTERN_SEPARATOR);
        cd.informationReport();

        System.out.println(PATTERN_SEPARATOR);
        System.out.println(PATTERN_SEPARATOR);

        hdd.spin();
        System.out.println(PATTERN_SEPARATOR);
        hdd.saveData("Project480.jar");
        System.out.println(PATTERN_SEPARATOR);
        hdd.writeBy();
        System.out.println(PATTERN_SEPARATOR);
        hdd.readBy();
        System.out.println(PATTERN_SEPARATOR);
        hdd.informationReport();

        /*BONUS

        Añade una clase para discos de vinilo (LP) y otra para blueRay.
        --HECHO.

        ¿Si tienes clases de las que heredas se aplicarían a LP y BlueRay? Si es así, extiende las nuevas
        clases. Si no es así, ¿deberías modificarla o ampliar una clase abstracta diferente?
        --PODRÍA HABER HECHO UNA CLASE ABSTRACTA, PERO COMO SE PEDÍA UNA INTERFAZ, LO HICE DIRECTAMENTE CON ELLA,
        SIMPLEMENTE LA CLASE PADRE IMPLEMENTA LA INTERFAZ Y TODOS LOS HIJOS HEREDAN LOS MÉTODOS DE ESA INTERFAZ DEFINIDOS EN LA CLASE PADRE.

        ¿Qué pasa con las ruedas y los frisbees? También son discos giratorios, pero no se utilizan para
        el almacenamiento de datos. ¿Cómo entrarían en este modelo de clases?
        -- SE PODRÍA INDICAR EN EL CONSTRUCTOR DE CADA UNA DE ELLAS QUE NO USAN TECNOLOGÍA DE LECTURA Y SOBREESCRIBIR ALGUNOS MÉTODOS.
        PERO LO MÁS NORMAL SERÍA HACER OTRA CLASE PADRE QUE HEREDEN MÉTODOS Y ATRIBUTOS DISTINTOS, YA QUE NO SON UNIDADES DE ALMACENAMIENTO

        Analiza ahora el ejercicio completo desde el punto de vista que plantean los principios SOLID, si
        los conoces. ¿Se cumplen todos? Elabora un breve informe con tus razones.
        -- INFORME SOLID
        SINGLE RESPONSIBILITY: YO CREO QUE SÍ, LA ÚNICA NOCIÓN PARA CAMBIAR ES LA TECNOLOGÍA DE ESCRITURA Y LECTURA
        OPEN/CLOSED: COMO SE HA HECHO CON LA PRIMERA PREGUNTA, HE EXTENDIDO EL PROYECTO A OTROS DISCOS DE ALMACENAMIENTO, Y YA ESTABA CERRADO EL CÓDIGO.
        LISKOV SUBSTITUTION:
        INTERFACE SEGREGATION: SOLO HE HECHO UNA INTERFAZ DE PROPÓSITO GENERAL PARA ESTE PROYECTO, ESTE NO SE CUMPLE.
        DEPENDECY INVERSION:
         */

    }
}
