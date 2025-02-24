package org.example;


public class ComputerBuilder {
    private final String cpu;
    private final String gpu;
    private final String ram;
    private final String storage;

    @Override
    public String toString() {
        return "CPU: " + cpu + "\nGPU: " + gpu + "\nRAM: " + ram + "\nStorage: " + storage;
    }

  
    private ComputerBuilder(Builder builder) {
        this.cpu = builder.cpu;
        this.gpu = builder.gpu;
        this.ram = builder.ram;
        this.storage = builder.storage;

    
    }

    public static class Builder {
        private String cpu = "N/A";
        private String gpu = "N/A";
        private String ram = "N/A";
        private String storage = "N/A";

        public Builder cpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder gpu(String gpu) {
            this.gpu = gpu;
            return this;
        }

        public Builder ram(String ram) {
            this.ram = ram;
            return this;
        }

        public Builder storage(String storage) {
            this.storage = storage;
            return this;
        }

        public ComputerBuilder build() {
            return new ComputerBuilder(this);
        }
    }

}
