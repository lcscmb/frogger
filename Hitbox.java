public class Hitbox{
    
    double x, y, x2, y2;
    int larg;
    
    public Hitbox(double _x, double _y, double _x2, double _y2, int larg){
        x = _x;
        y = _y;
        x2 = _x2;
        y2 = _y2;
    }
    
    public boolean testaColisao(double xsapo, double ysapo, double xcarro, double ycarro, int largcarro){
    
        if(ysapo - 50 == ycarro){
            if((xsapo-50) < xcarro + largcarro && (xsapo + 50) > xcarro){
                return true;
            }
        }
        if(ysapo + 50 > ycarro+100 && ysapo - 50 < ycarro){
               if((xsapo-50) < xcarro + largcarro && (xsapo + 50) > xcarro){
                return true;
            }
        }
        /*if((xsapo-50) <= xcarro + largcarro && (xsapo + 50) > xcarro){
            if((ysapo-50) < ycarro || (ysapo+50)  > ycarro - 100){
                return true;
            }
        }*/
        
        return false;
    }
    
}