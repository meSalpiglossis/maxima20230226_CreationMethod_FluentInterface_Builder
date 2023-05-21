package builder;

public class BuilderUseDemo {
    public static void main(String[] args) {

        Terminator t800 = new Terminator.Builder()
                                        .setTorso("T800 torso")
                                        .setLeftLeg("T800 left leg")
                                        .setRightLeg("T800 right leg")
                                        .setRightHand("T800 right hand")
                                        .setLeftHand("T800 left hand")
                                        .setHead("T800 head")
                                        .setSkin("T800 skin")
                                        .build();
    }
}
