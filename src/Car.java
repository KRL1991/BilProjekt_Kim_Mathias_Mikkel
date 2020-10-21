public class Car {

    private String password;
    public static int speed;
    public static boolean engineOn = false;
    public static boolean clutchState = false;
    public static int currentGear;
    public static boolean lightHighbeam = false;
    public static boolean lightsOnOff = false;
    public static boolean steeringWheel = false;
    public static boolean hornOnOff;
    public static boolean windowsOpenClosed = false;
    public static boolean ohShitButton = false;
    public static boolean handBrake = false;
    public static boolean blinkersLeft = false;
    public static boolean blinkersRight = false;
    public static boolean wiperOnOff = false;
    public static boolean radioOn = false;
    public static boolean radio1 = false;
    public static boolean radio2 = false;
    public static boolean radio3= false;
    public static boolean doorsOpen1 = false;
    public static boolean doorsOpen2 = false;
    public static boolean doorsOpen3 = false;
    public static boolean doorsOpen4 = false;
    public static boolean doorsOpen5 = false;


    public static void clutch(int x) {

        switch (x) {

            case 1:
                System.out.println("Koblingen er trådt ned");
                clutchState = true;
                break;
            case 2:
                System.out.println("Koblingen er sluppet");
                clutchState = false;
                break;
            default:
                System.out.println("Urørt");
                break;

        }
    }

    public static void gearbox(int x) {

        switch (x) {

            case 1:
                System.out.println("\t\tDu er nu i første gear");
                currentGear = 1;
                break;
            case 2:
                System.out.println("\t\tDu er nu i andet gear");
                currentGear = 2;
                break;
            case 3:
                System.out.println("\t\tDu er nu i tredje gear");
                currentGear = 3;
                break;
            case 4:
                System.out.println("\t\tDu er nu i fjerde gear");
                currentGear = 4;
                break;
            case 5:
                System.out.println("\t\tDu er nu i femte gear");
                currentGear = 5;
                break;
            case 6:
                System.out.println("\t\tDu er nu i sjette gear");
                currentGear = 6;
                break;
            default:
                System.out.println("\t\tDu er nu i neutral gear");
                currentGear = 0;
                break;

        }
    }


    public static void engineButton(int x) {

        switch (x) {

            case 1:
                System.out.println("Bilen er tændt");
                engineOn = true;
                break;
            case 2:
                System.out.println("Bilen er slukket");
                engineOn = false;
                break;
            default:
                System.out.println("Slukket");
                break;

        }
    }

    public static int speeder(int x) {

        switch (x) {

            case 1: // Accellerer
                for (int i = 0; i < 120; i++) {
                    speed++;
                }
                break;
            case 2: // Deccellerer
                for (int i = speed; -20 < i; i--) {
                    speed--;
                }
                break;
            default:
                break;

        }
        return speed;

    }

    public static int brake(int x) {

        switch (x) {

            case 1: // bremser

                if (speed > 0) {
                    while (speed > 0) {
                        speed--;
                    }
                } else if (speed < 0) {
                    while (speed < 0) {
                        speed++;
                    }
                }
                break;

            case 2:

                break;
        }
        return speed;
    }

    public static void handbrake(int x) {

        switch (x) {

            case 1:
                System.out.println("Bilens håndbremse trækkes");
                handBrake = true;
                break;
            case 2:
                System.out.println("Bilens håndbremse slippes");
                steeringWheel = false;
                break;
            default:
                System.out.println("Bilens håndbremse er inaktiv");
                break;

        }


    }


    Car() {
        this.password = "password1234";
        this.engineOn = false;
        this.speed = 0;
        this.doorsOpen1 = false;
        this.doorsOpen2 = false;
        this.doorsOpen3 = false;
        this.doorsOpen4 = false;
        this.doorsOpen5 = false;
        this.lightsOnOff = false;
        this.blinkersLeft = false;
        this.blinkersRight = false;
       Brands carBrand = Brands.Audi;




    }

    public void engineState(CarKey key) {
        if (key.password.equals(password)) {
            engineButton(1);
        } else {
            System.out.println("Bilen kan ikke tænde, pga. forkert nøgle.");
        }

    }


    public static void LightHighbeam(int x) {

        switch (x) {

            case 1:
                System.out.println("Langtlys slået til");
                lightHighbeam = true;
                break;
            case 2:
                System.out.println("Langtlys slået fra");
                lightHighbeam = false;
                break;
            default:
                System.out.println("Slukket");
                break;

        }
    }

    public static void lightsOnOff(int x) {

        switch (x) {

            case 1:
                System.out.println("Lyset er tændt");
                lightsOnOff = true;
                break;
            case 2:
                System.out.println("Lyset er slukket");
                lightsOnOff = false;
                break;
            default:
                System.out.println("Slukket");
                break;

        }
    }

    public static void steeringWheel(int x) {

        switch (x) {

            case 1:
                System.out.println("Bilen drejer til højre");
                steeringWheel = true;
                break;
            case 2:
                System.out.println("Bilen drejer til venstre");
                steeringWheel = false;
                break;
            default:
                System.out.println("Bilen kører ligeud");
                break;

        }
    }

    public static void blinkers(int x) {

        switch (x) {

            case 1:
                System.out.println("\t\tBlink til højre");
                blinkersLeft = false;
                blinkersRight = true;
                break;
            case 2:
                System.out.println("\t\tBlink til venstre");
                blinkersLeft = true;
                blinkersRight = false;
                break;
            default:
                System.out.println("\t\tBlink slukket");
                blinkersLeft = false;
                blinkersRight = false;
                break;

        }
    }

    public static void doorsOpen(int x) {

        switch (x) {

            case 1:
                System.out.println("\t\tDør 1 åbner")
                ;
                doorsOpen1 = true;

                break;
            case 2:
                System.out.println("\t\tDør 2 åbner");
                doorsOpen2 = true;
                break;
            case 3:
                System.out.println("\t\tDør 3 åbner");
                doorsOpen3 = true;
                break;
            case 4:
                System.out.println("\t\tDør 4 åbner");
                doorsOpen4 = true;
                break;
            case 5:
                System.out.println("\t\tBagagerum åbner");
                doorsOpen5 = true;
                break;
            default:
                System.out.println("\t\tAlle døre åbner");
                doorsOpen1 = true;
                doorsOpen2 = true;
                doorsOpen3 = true;
                doorsOpen4 = true;
                doorsOpen5 = true;
                break;

        }

    }

    public static void doorsClosed(int x) {

        switch (x) {

            case 1:
                System.out.println("\t\tDør 1 lukker");
                doorsOpen1 = false;
                break;
            case 2:
                System.out.println("\t\tDør 2 lukker");
                doorsOpen2 = false;
                break;
            case 3:
                System.out.println("\t\tDør 3 lukker");
                doorsOpen3 = false;
                break;
            case 4:
                System.out.println("\t\tDør 4 lukker");
                doorsOpen4 = false;
                break;
            case 5:
                System.out.println("\t\tBagagerum lukker");
                doorsOpen5 = false;
                break;
            default:
                System.out.println("\t\tAlle døre lukker");
                doorsOpen1 = false;
                doorsOpen2 = false;
                doorsOpen3 = false;
                doorsOpen4 = false;
                doorsOpen5 = false;
                break;

        }

    }

    public static void hornOnOff(int x) {

        switch (x) {

            case 1:
                System.out.println("Bilens horn aktiveres ved at holde knappen inde");
                hornOnOff = true;
                break;

            default:
                System.out.println("Bilens horn er inaktiv ");
                break;

        }
    }

    public static void windowsOpenClosed(int x) {

        switch (x) {

            case 1:
                System.out.println("Vinduet er 75% åben");
                windowsOpenClosed = true;
                break;
            case 2:
                System.out.println("Vinduet er 50% åben");
                windowsOpenClosed = true;
                break;
            case 3:
                System.out.println("Vinduet er 25% åben");
                windowsOpenClosed = true;
                break;
            case 4:
                System.out.println("Vinduet er helt åben");
                windowsOpenClosed = true;
                break;

            default:
                System.out.println("Vinduet er lukket");
                windowsOpenClosed = false;
                break;

        }
    }

    public static void flashingLights() throws InterruptedException {
        int i = 0;
        while (i < 10) {
            Thread.sleep(1000);

            if (i % 2 == 0) {
                Car.blinkersRight = false;
                Car.blinkersLeft = false;
                System.out.println("\t\tblinkers off");

            } else {
                Car.blinkersRight = false;
                Car.blinkersLeft = false;
                System.out.println("\t\tblinkers on");
            }

            i++;

        }
    }

    public static void ohShitButton(int x) throws InterruptedException {

        switch (x) {

            case 1:
                System.out.println("Bilens katastrofeblink aktiveres ved at trykke på knappen");
                ohShitButton = true;
                flashingLights();
                break;

            case 2:
                System.out.println("Bilens katastrofeblink deaktiveres ved at trykke på knappen igen");
                ohShitButton = false;

            default:
                System.out.println("Bilens katastrofeblink er inaktiv");
                ohShitButton = false;
                break;
        }
    }

    public static void wiperOnOff(int x) {

        switch (x) {

            case 1:
                System.out.println("Wiperspeed = 1");
                wiperOnOff = true;
                break;
            case 2:
                System.out.println("Wiperspeed = 2");
                wiperOnOff = true;
                break;
            case 3:
                System.out.println("Wiperspeed = 3");
                wiperOnOff = true;
                break;

            default:
                System.out.println("Wiperspeed = 0");
                wiperOnOff = false;
                break;

        }
    }

    public static void radioOn(int x) {

        switch (x) {

            case 1:
                System.out.println("\t\tRadioen er tændt");
                radioOn= true;
                break;
            case 2:
                System.out.println("\t\tRadioen starter program 1");
                radioOn= true;
                radio1 = true;
                break;
            case 3:
                System.out.println("\t\tRadioen starter program 2");
                radioOn= true;
                radio2 = true;
                break;
            case 4:
                System.out.println("\t\tRadioen starter program 3");
                radioOn= true;
                radio3 = true;
                break;

            default:
                System.out.println("\t\tRadioen er slukket");
                radioOn= false;
                radio1 = false;
                radio2 = false;
                radio3 = false;
                break;


        }
    }


}