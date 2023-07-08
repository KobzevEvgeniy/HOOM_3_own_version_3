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


    public double getDistance(int x1, int y1, int x2, int y2){
        return Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2),2));
    }



        @Override
        public String toString() {
            return String.format("x: %d, y: %d", x, y);
        }

        public int getDistance(Arena targetPosition) {
            return (int) Math.sqrt(Math.pow(x - targetPosition.getPosition()[0], 2) +
                    Math.pow(y - targetPosition.getPosition()[1], 2));
        }



}



