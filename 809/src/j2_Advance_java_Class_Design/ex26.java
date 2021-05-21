package j2_Advance_java_Class_Design;

public class ex26 {

	public static void main(String[] args) {
		
		/*Course[] c=Course.values();
		
		System.out.println(c[0].getCost());*/
		for(Course a:Course.values()){
			System.out.print(a+" Fees "+a.getCost()+" ");
		}
	}

}
enum Course { JAVA(100),J2ME(150);
    private int cost;
    private Course(int c) {
    	this.cost=c;        
    }
    
    int getCost() {
    	return cost;
    
    }
    
    void setCost(int c) {
    	this.cost=c;        
    }
}   

/*
Given the code fragment:

for(Course a:Course.values()){
	System.out.print(a+" Fees "+a.getCost()+" ");
}

Which is the valid definition of the Course enum?

A) enum Course { JAVA(100),J2ME(150);
        private int cost;
        Course(int c) {
        	this.cost=c;        
        }
        int getCost(){
         	return cost;
        }
     
     }
     
B) enum Course{ JAVA(100),J2ME(150);
        private static int cost;
        private Course(int c) {
        	this.cost=c;        
        }
        
        static int getCost() {
        	return cost;        
        }
        
    }
    
C) enum Course {JAVA(100),J2ME(150);
        private int cost;
        public Course(int c) {
        	this.cost=c;        
        }
        
        int getCost() {
        	return cost;        
        }
     }
     
     
D) final enum Course { JAVA(100),J2ME(150);
        private int cost;
        public Course(int c) {
        	this.cost=c;        
        }
        
        int getCourse() {
        	return cost;
        
        }
        
        void setCost(int c) {
        	this.cost=c;        
        }
    }   
        




ans:A

*/