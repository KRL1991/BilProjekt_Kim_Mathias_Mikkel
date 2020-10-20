public class CarTest {

    public static void main(String[] args) throws InterruptedException {
        testSuite();
    }

    private static void testSuite() throws InterruptedException {
        System.out.println("Testsuiten kører.");

        System.out.print("Test 1 (Bilen skal være tændt): ");
        testStartCarWithCorrectKey();

        System.out.print("Test 2 (Bilen skal ikke være tændt): ");
        testStartCarWithWrongKey();

        System.out.print("Test 3 (Bilen skal ikke være tændt): ");
        testEngineOff();

        System.out.print("Test 4 (Bilen skal være tændt): ");
        testEngineOn();

        System.out.print("Test 5 (Bilen Accellerer = 120): ");
        testAcellerate();

        System.out.print("Test 6 (Bilen Deccellerer = -20): ");
        testDecellerate();

        System.out.print("Test 7 (Bilen bremser = 0): ");
        testBrake();

        System.out.print("Test 8 (Koblingen slår til): ");
        testClutchOn();

        System.out.print("Test 9 (Koblingen slår fra): ");
        testClutchOff();

        System.out.println("Test 10 (test af alle gear): ");
        testGearbox();

        System.out.print("Test 11 (Lyset tændes): ");
        testlightOn();

        System.out.print("Test 12 (Lyset slukkes): ");
        testlightOff();

        System.out.print("Test 13 (Langtlys tændes): ");
        testLightHighbeamOn();

        System.out.print("Test 13 (Langtlys slukkes): ");
        testLightHighbeamOff();

        System.out.print("Test 14 (Bilen drejer til højre): ");
        testSteeringRight();

        System.out.print("Test 15 (Bilen drejer til venstre): ");
        testSteeringLeft();

        System.out.print("Test 16 (Bilen kører ligeud): " );
        testSteeringStraight();

        System.out.println("Test 17 (Test af alle døre): ");
        testDoorsOpenClosed();

        System.out.print("Test 18 (Test af hornet): ");
        testHornActivated();

        System.out.print("Test 19 (Test af åbne vindue): ");
        testwindowsOpen();

        System.out.print("Test 20 (Test af åbne vindue): ");
        testwindowsClosed();

        System.out.println("Test 21 (Test af blinklys): ");
        testBlinkers();

        System.out.print("Test 22 (Test af håndbremse - trukket): ");
        testHandBrakeActivated();

        System.out.print("Test 23 (Test af håndbremse - sluppet): ");
        testHandBrakeReleased();

        System.out.print("Test 24 (Test af ohShitButton): ");
        testOhShitButton();

        System.out.println("Test 25 (Test af Radio - tændt): ");
        testRadioOn();

        System.out.print("Test 26 (Test af vinduesvisker - vinduesvisker igang): ");
        testWiperOn();

        System.out.print("Test 27 (Test af vinduesvisker - vinduesvisker stoppet): ");
        testWiperOff();

    }


    private static void testStartCarWithCorrectKey() {
        Car andrasCar = new Car();
        CarKey key = new CarKey("password1234");
        andrasCar.engineState(key);
    }

    private static void testStartCarWithWrongKey() {
        Car andrasCar = new Car();
        CarKey key = new CarKey("hest");
        andrasCar.engineState(key);
    }

    private static void testEngineOn() {
        Car.engineButton(1);
    }

    private static void testEngineOff() {
        Car.engineButton(2);
    }

    private static void testAcellerate() {
        System.out.println(Car.speeder(1));
    }


    private static void testDecellerate() {
        System.out.println(Car.speeder(2));
    }


    private static void testBrake() {
        System.out.println(Car.brake(1));
    }

    private static void testClutchOn() {
        Car.clutch(1);
    }

    private static void testClutchOff() {
        Car.clutch(2);
    }

    private static void testGearbox() {
        Car.gearbox(1);
        Car.gearbox(2);
        Car.gearbox(3);
        Car.gearbox(4);
        Car.gearbox(5);
        Car.gearbox(6);
        Car.gearbox(18289);
    }

    private static void testlightOn() {
        Car.lightsOnOff(1);
    }

    private static void testlightOff() {
        Car.lightsOnOff(2);
    }

    private static void testLightHighbeamOn() {
        Car.LightHighbeam(1);
    }

    private static void testLightHighbeamOff() {
        Car.LightHighbeam(2);
    }

    private static void testSteeringRight() {
        Car.steeringWheel(1);
    }

    private static void testSteeringLeft() {
        Car.steeringWheel(2);
    }

    private static void testSteeringStraight(){
        Car.steeringWheel(12467);
    }

    private static void testDoorsOpenClosed() {
        Car.doorsOpen(1);
        Car.doorsOpen(2);
        Car.doorsOpen(3);
        Car.doorsOpen(4);
        Car.doorsOpen(5);
        Car.doorsClosed(781361874);
        Car.doorsClosed(1);
        Car.doorsClosed(2);
        Car.doorsClosed(3);
        Car.doorsClosed(4);
        Car.doorsClosed(5);
        Car.doorsOpen(17481234);
    }

    private static void testHornActivated() {
        Car.hornOnOff(1);
    }

    private static void testwindowsOpen() {
        Car.windowsOpenClosed(1);
    }
    private static void testwindowsClosed() {
        Car.windowsOpenClosed(90);
    }

    private static void testBlinkers() {
        Car.blinkers(1);
        Car.blinkers(2);
        Car.blinkers(1278126);

    }

    private static void testHandBrakeActivated (){
        Car.handbrake(1);
    }

    private static void testHandBrakeReleased (){
        Car.handbrake(2);

}
    private static void testWiperOn() {
        Car.wiperOnOff(1);
    }

    private static void testWiperOff() {
        Car.wiperOnOff(90);
    }

    private static void testRadioOn(){
        Car.radioOn(1);
        Car.radioOn(2);
        Car.radioOn(3);
        Car.radioOn(4);
        Car.radioOn(8136871);

    }


    private static void testOhShitButton() throws InterruptedException {
        Car.ohShitButton(1);
        Car.ohShitButton(2);
    }
}

