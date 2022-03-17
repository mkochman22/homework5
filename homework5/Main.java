//Mary Kochmanski
//CIS 221, Tuesdays and Thursdays at 2:10PM

//Outer class
class Role {
  String role = "Duelist";
  
  //Private Inner class
  private class Agent {
    String agent = "Reyna";
    
  }
  //Method to retrieve information from the private inner class
  String get() {
  	Agent in = new Agent();
    return in.agent;
  }
}

public class Main {
  public static void main(String[] args) {
    Role myRole = new Role();
    System.out.println(myRole.role + ": " + myRole.get());
  }
}
