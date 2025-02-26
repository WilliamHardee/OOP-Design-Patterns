package org.example.PrototypePattern;

public abstract class Computer {
    private String cpu;
    private String caseModel;
    private String ram;

    protected Computer(String cpu, String caseModel, String ram) {
        this.cpu = cpu;
        this.caseModel = caseModel;
        this.ram = ram;
    }

    protected Computer(Computer computer) {
        this.cpu = computer.cpu;
        this.caseModel = computer.caseModel;
        this.ram = computer.ram;
    }

    public abstract Computer clone();

    public String getCpu() { return cpu; }
    public String getCaseModel() { return caseModel; }
    public String getRam() { return ram; }
}