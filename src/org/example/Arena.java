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

    public void getMove() {


    }
    public double getXY(int x1, int y1, int x2, int y2){
        return ((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
    }






}
