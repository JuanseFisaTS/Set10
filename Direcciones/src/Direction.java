public enum Direction {
    NORTH("North"),
    SOUTH("South"),
    EAST("East"),
    WEST("West");
 

    private String name;
 
   
    Direction(String name) {
        this.name = name;
    }
 
 
    public String getName() {
        return name;
    }
 
   
    public Direction left() {
    
        switch (this) {
            case NORTH:
                return WEST; 
            case SOUTH:
                return EAST; 
            case EAST:
                return NORTH;
            case WEST:
                return SOUTH; 
        }
        return this;
    }
 

    public Direction right() {
        
        switch (this) {
            case NORTH:
                return EAST;
            case SOUTH:
                return WEST; 
            case EAST:
                return SOUTH; 
            case WEST:
                return NORTH; 
        }
        return this;
    }
}