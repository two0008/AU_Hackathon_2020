public class Character {

name = nameIn;
health = healthIn;
status = statusIn;

public String getName() {

return name;
}

public void setName(String nameIn) { 

this.name = nameIn;
}

public int gethealthIn() {

return health;
}

public void setHealth(int healthIn) {

this.health = healthIn;
}

public boolean getStatus() {
if (health <= 0) { 
return false; 
} else {
return true; }

return status;
}

public void setStatus(boolean StatusIn) { 
this.status = statusIn;
}

}