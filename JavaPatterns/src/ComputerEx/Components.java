package ComputerEx;

import java.util.ArrayList;
import java.util.List;


public interface Components {

    void showPrice();
    //void addComponent();

    class leaf implements Components {

        public String name;
        public int price;


        public leaf(String name, int price) {
            this.name = name;
            this.price = price;
        }

        public void showPrice() {

            System.out.println( name + " : " + price);
        }

    }


    public class composite implements Components{

        public String name;
        List<Components> components = new ArrayList<>();

        public void addComponent(Components com) {

            components.add(com);

        }

        public composite(String name) {
            this.name = name;
        }

        @Override
        public void showPrice() {

            System.out.println(name);
            for (Components c : components)
            {
                c.showPrice();
            }
        }

    }
}