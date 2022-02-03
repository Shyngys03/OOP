import java.util.Scanner;


class project{
    class Position{

        private int x, y;

        Position(int x, int y){
            this.x = x;
            this.y = y;
        }

        void setX(int x){
            this.x = x;
        }

        void setY(int y){
            this.y = y;
        }

        int getX(){
            return this.x;
        }

        int getY(){
            return this.y;
        }

        boolean equals(Position k){
            return this.x == k.getX() && this.y == k.getY();
        }

        public String toString(){
            return "(" + getX() + "," + getY() + ")"; 
        }
    }


    interface Player{
        void moveRight();
        void moveLeft();
        void moveUp();
        void moveDown();
        void setMap(Map x) throws Exception;
        Position getPosition();

    }

    class MyPlayer implements Player{
        Map m;
        Position pos;


        public void setMap(Map m){
            this.m = m;
            for(int i = 0; i < m.getSize(); i++){
                for(int j = 0; j < m.getSize(); j++){
                    if(m.mp[i][j] == 'P'){
                        pos = new Position(i, j);
                    }
                }
            }
        }

       @Override
       public void moveLeft(){
           for(int i = 0; i < m.getSize(); i++){
               for(int j = 0; j < m.getSize(); j++){
                   if(m.mp[i][j] == 'P' && m.mp[i][j - 1] == '0'){
                        m.mp[i][j - 1] = 'P';
                        m.mp[i][j] = '0';
                        pos = new Position(i, j);
                   }
               }
           }
       } 

       public void moveRight(){
            for(int i = 0; i < m.getSize(); i++){
                for(int j = 0; j < m.getSize(); j++){
                    if(m.mp[i][j] == 'P' && m.mp[i][j + 1] == '0'){
                         m.mp[i][j + 1] = 'P';
                        m.mp[i][j] = '0';
                        pos = new Position(i, j);
                    }
                }
            }
       }

       public void moveDown(){
        for(int i = 0; i < m.getSize(); i++){
            for(int j = 0; j < m.getSize(); j++){
                if(m.mp[i][j] == 'P' && m.mp[i + 1][j] == '0'){
                     m.mp[i + 1][j] = 'P';
                    m.mp[i][j] = '0';
                    pos = new Position(i, j);
                }
            }
        }
       }

       public void moveUp(){
        for(int i = 0; i < m.getSize(); i++){
            for(int j = 0; j < m.getSize(); j++){
                if(m.mp[i - 1][j] == 'P' && m.mp[i][j] == '0'){
                     m.mp[i - 1][j] = 'P';
                    m.mp[i][j] = '0';
                    pos = new Position(i, j);
                }
            }
        }
       }

       public Position getPosition(){
           return this.pos;
       }
    }

    class Map{

        public int size;
        public char[][] mp;

        Map(Scanner sc) throws InvalidMapException{
            sc = new Scanner(System.in);

            this.size = sc.nextInt();

            if(this.size == 0){
                throw new InvalidMapException("Map size can not be zero");
            }

            mp = new char[size][size];

            for(int i = 0; i < size; i++){
                for(int j = 0; j < size; j++){
                    mp[i][j] = sc.next().charAt(0);
                    if(mp[i][j] != '0' && mp[i][j] != '1' && mp[i][j] != 'P'){
                        throw new InvalidMapException("Not enough map elements");
                    }
                }
            }

            sc.close();
        }

        int getSize(){
            return this.size;
        }

        char getValueAt(int x, int y){
            return mp[x][y];
        }

        void print(){
            for(int i = 0; i < size; i++){
                for(int j = 0; j < size; j++){
                    System.out.print(mp[i][j] + ' ');
                }
                System.out.println();
            }
        }
    }

    class Game{
        Map m;
        Player player;

        Game(Map m){
            this.m = m;
        }

        void setMap(Map m){
            this.m = m;
        }

        void addPlayer(Player player){
            this.player = player;
        }
    }

    class InvalidMapException extends Exception{
        InvalidMapException(String message){
            super(message);
        }
    }
}