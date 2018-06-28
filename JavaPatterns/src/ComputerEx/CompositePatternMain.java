package ComputerEx;

import ComputerEx.Components;

public class CompositePatternMain {

    public static void main(String[] args) {
        Components.composite ph = new Components.composite("Peri");
        Components.composite cabinet = new Components.composite("Cabinet");
        Components.composite computer = new Components.composite("Computer");
        Components.composite mb = new Components.composite("Mother Board");

        Components mouse = new Components.leaf("Mouse",400);
        Components monitor = new Components.leaf("Monitor",10000);
        Components hdd = new Components.leaf("HDD",20000);
        Components graphics= new Components.leaf("Graphics Card",5000);
        Components ram = new Components.leaf("RAM",3000);
        Components cpu = new Components.leaf("CPU",30000);

        ph.addComponent(mouse);
        ph.addComponent(monitor);
        cabinet.addComponent(graphics);
        cabinet.addComponent(hdd);
        cabinet.addComponent(mb);
        mb.addComponent(ram);
        mb.addComponent(cpu);
        computer.addComponent(ph);
        computer.addComponent(cabinet);

        computer.showPrice();


    }

}
