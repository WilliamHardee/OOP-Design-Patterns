package org.example.PrototypePattern;

public class GamingComputer extends Computer {
    private String gpu;


    public GamingComputer(String cpu, String caseModel, String ram, String gpu) {
        super(cpu, caseModel, ram);
        this.gpu = gpu;
    }

    public GamingComputer(GamingComputer computer) {
        super(computer);
        this.gpu = computer.gpu;
    }

    @Override
    public GamingComputer clone() {  
        return new GamingComputer(this);
    }

    public String getGpu() { return gpu; }
}
