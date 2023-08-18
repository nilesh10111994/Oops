package Design_pattern.Creational.Builder;

public class BuilderPattern {
    String phone;
    String chip;
    String version;

    public BuilderPattern() {

    }

    public BuilderPattern setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public BuilderPattern setChip(String chip) {
        this.chip = chip;
        return this;
    }

    public BuilderPattern setVersion(String version) {
        this.version = version;
        return this;
    }

    public BuilderPattern(String phone, String chip, String version) {
        this.phone = phone;
        this.chip = chip;
        this.version = version;
    }

    @Override
    public String toString() {
        return "BuilderPattern{" +
                "phone='" + phone + '\'' +
                ", chip='" + chip + '\'' +
                ", version='" + version + '\'' +
                '}';
    }
}
