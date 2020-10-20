class Tree {
  private String treeName;
  private String treeType;
  private String leafColor;
  private boolean leavesFall;

  Tree(){
    treeName = "";
    treeType = "";
    leafColor = "";
    leavesFall = false;
  }

  Tree(String aTreeName, String aTreeType, String aLeafColor, boolean aLeavesFall){
    treeName = aTreeName;
    treeType = aTreeType;
    leafColor = aLeafColor;
    leavesFall = aLeavesFall;
  }

  void setTreeName(String theTreeName){
    treeName = theTreeName;
  }
  void setTreeType(String theTreeType){
    treeType = theTreeType;
  }
  void setLeafColor(String theLeafColor){
    leafColor = theLeafColor;
  }
  void setLeavesFall(boolean theLeavesFall){
    leavesFall = theLeavesFall;
  }
  String getTreeName(){
    return treeName;
  }
  String getTreeType(){
    return treeType;
  }
  String getLeafColor(){
    return leafColor;
  }
  boolean getLeavesFall(){
    return leavesFall;
  }

 String hasLeaves(){
    if(leavesFall == false){
      return "does not";
    }
    else{
      return "does";
    }
  }

  void print(){
    System.out.println("This is a " + treeName + " tree. It is a " + treeType + " and its leaves are currently " + leafColor + ". It " + hasLeaves() + " lose its leaves for the winter.");
  }
}