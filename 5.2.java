public abstract class Animal {
        private final String name;
        private final int age;

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        Animal(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return '\'' + name + '\'' + ", age= " + age;
        }
    }

    public class Lion extends Animal {
        private final double bodyLength;

        Lion(String name, int age, double bodyLength) {
            super(name, age);
            this.bodyLength = bodyLength;
        }

        public double getBodyLength() {
            return bodyLength;
        }

        @Override
        public String toString() {
            return super.toString() + ", bodyLength= " + bodyLength;
        }
    }


    public class Monkey extends Animal {
        private final String color;

        Monkey(String name, int age, String color) {
            super(name, age);
            this.color = color;
        }

        public String getColor() {
            return color;
        }

        @Override
        public String toString() {
            return super.toString() + ", color= " + color;
        }
    }

    public class Zoo {
        private final ArrayList<Animal> Animals = new ArrayList<Animal>();

        public void add(Animal animal) {
            Animals.add(animal);
        }

        public int getSize() {
            return Animals.size();
        }

        public String getReport() {
            var strB = new StringBuilder();

            for (var i = 0; i < Animals.size(); i++) {
                strB.append(i + 1).append(" ").append(Animals.get(i)).append("\n");
            }

            return strB.toString();
        }
    }
