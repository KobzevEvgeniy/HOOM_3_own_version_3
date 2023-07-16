package org.example;

//
//1. Создать класс с описанием координат, x и y.
//2. Добавить в абстрактный класс поле с координатами
//        и пробросить его инициализацию до конструкторов персонажей.
//        Farmer farmer = new Farmer(getName(), x, y);
//3.2 Поиск среди противников наиболее приближённого и вывести в консоль.
public  class Arena {
    public int x;
    public int y;

    public Arena(int x, int y){
        this.x=x;
        this.y=y;
    }
    public int[] getPosition() {
        return new int[]{x, y};
    }


        @Override
        public String toString() {
            return String.format("x: %d, y: %d", x, y);
        }

        public int getDistance(Arena targetPosition) {
            return (int) Math.sqrt(Math.pow(x - targetPosition.getPosition()[0], 2) +
                    Math.pow(y - targetPosition.getPosition()[1], 2));
        }
    public String getDirection(Arena otherCoordinates) {
        int[] my = this.getPosition();
        int[] other = otherCoordinates.getPosition();
        if (Math.abs(my[0] - other[0]) > Math.abs(my[1] - other[1])) {
            if (my[0] > other[0]) {
                return "left";
            } else {
                return "right";
            }
        } else {
            if (my[1] > other[1]) {
                return "forward";
            } else {
                return "back";
            }
        }
    }
    public boolean isEqual(Arena coordinates) {
        return this.x == coordinates.x && this.y == coordinates.y;
    }


}



