package com.strtuts2.DAO;

public class User {
private int id;
private String name;
private boolean value;
private long Longnumber;
private float FloatValue;
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + Float.floatToIntBits(FloatValue);
	result = prime * result + (int) (Longnumber ^ (Longnumber >>> 32));
	result = prime * result + id;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	result = prime * result + (value ? 1231 : 1237);
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	User other = (User) obj;
	if (Float.floatToIntBits(FloatValue) != Float.floatToIntBits(other.FloatValue))
		return false;
	if (Longnumber != other.Longnumber)
		return false;
	if (id != other.id)
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	if (value != other.value)
		return false;
	return true;
}
}
