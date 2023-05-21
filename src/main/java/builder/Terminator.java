package builder;

public class Terminator {
    private final String torso;
    private final String rightHand;
    private final String rightLeg;
    private final String leftLeg;
    private final String leftHand;
    private final String head;
    private final String skin;

    private Terminator(String torso, String rightHand, String rightLeg, String leftLeg, String leftHand, String head, String skin) {
        this.torso = torso;
        this.rightHand = rightHand;
        this.rightLeg = rightLeg;
        this.leftLeg = leftLeg;
        this.leftHand = leftHand;
        this.head = head;
        this.skin = skin;
    }

    public static class Builder {
        private String torso;
        private String rightHand;
        private String rightLeg;
        private String leftLeg;
        private String leftHand;
        private String head;
        private String skin;

        public Builder setTorso(String torso) {
            this.torso = torso;
            return this;
        }

        public Builder setRightHand(String rightHand) {
            this.rightHand = rightHand;
            return this;
        }

        public Builder setRightLeg(String rightLeg) {
            this.rightLeg = rightLeg;
            return this;
        }

        public Builder setLeftLeg(String leftLeg) {
            this.leftLeg = leftLeg;
            return this;
        }

        public Builder setLeftHand(String leftHand) {
            this.leftHand = leftHand;
            return this;
        }

        public Builder setHead(String head) {
            this.head = head;
            return this;
        }

        public Builder setSkin(String skin) {
            this.skin = skin;
            return this;
        }

        public Terminator build() {
            return new Terminator(torso, rightHand, rightLeg, leftLeg, leftHand, head, skin);
        }
    }
}
