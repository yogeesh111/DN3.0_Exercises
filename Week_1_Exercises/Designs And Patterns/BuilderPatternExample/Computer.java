package BuilderPatternExample;

public class Computer {
    private String cpu;
    private String ram;
    private String storage;

    public String getCpu() {
        return cpu;
    }

    public String getRam() {
        return ram;
    }

    public String getStorage() {
        return storage;
    }

    private Computer(Builder builder)
    {
        this.cpu=builder.cpu;
        this.ram=builder.ram;
        this.storage=builder.storage;
    }

    static class Builder{
        private String cpu;
        private String ram;
        private String storage;




        public Builder setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder setRam(String ram) {
            this.ram = ram;
            return this;
        }

        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public Computer build()
        {
            return new Computer(this);
        }
    }
}
