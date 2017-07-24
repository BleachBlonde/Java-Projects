package assignment_3;

public class Part_6_Task implements Part_6_Priority {
private String msg, priority;
public int critLevel;

public Part_6_Task (String msg, int critLevel) {
	this.msg = msg;
	this.critLevel = critLevel;
	
	if (critLevel == 1) {
		priority = "Do now!";
	}
	else if (critLevel == 2) {
		priority = "Getting close there";
	}
	else if (critLevel == 3) {
		priority = "Don't stress yet";
	}
	else if (critLevel == 4) {
		priority = "Plentyyyy of time";
	}
	else {
		priority = "Not Important";
	}
}

public void setPriority (int critLevel) {
	this.critLevel = critLevel;
}

public int getPriority() {
	return critLevel;
}

public String toString() {
	return msg + "\t" + "Priority Level: " + critLevel + "\t" + priority;
}
}