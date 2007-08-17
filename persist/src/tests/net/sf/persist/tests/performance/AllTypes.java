
//$Id$

package net.sf.persist.tests.performance;

import net.sf.persist.annotations.Column;

public class AllTypes {

	private long intCol;
	private boolean booleanCol;
	private int tinyintCol;
	private int smallintCol;
	private long bigintCol;
	private long decimalCol;
	private double doubleCol;
	private float realCol;

	public long getIntCol() { return intCol; }
	public void setIntCol(long intCol) { this.intCol = intCol; }

	public boolean getBooleanCol() { return booleanCol; }
	public void setBooleanCol(boolean booleanCol) { this.booleanCol = booleanCol; }

	public int getTinyintCol() { return tinyintCol; }
	public void setTinyintCol(int tinyintCol) { this.tinyintCol = tinyintCol; }

	public int getSmallintCol() { return smallintCol; }
	public void setSmallintCol(int smallintCol) { this.smallintCol = smallintCol; }

	public long getBigintCol() { return bigintCol; }
	public void setBigintCol(long bigintCol) { this.bigintCol = bigintCol; }

	public long getDecimalCol() { return decimalCol; }
	public void setDecimalCol(long decimalCol) { this.decimalCol = decimalCol; }

	public double getDoubleCol() { return doubleCol; }
	public void setDoubleCol(double doubleCol) { this.doubleCol = doubleCol; }

	public float getRealCol() { return realCol; }
	public void setRealCol(float realCol) { this.realCol = realCol; }

	private java.sql.Time timeCol;
	private java.sql.Date dateCol;
	private java.sql.Timestamp timestampCol;

	public java.sql.Time getTimeCol() { return timeCol; }
	public void setTimeCol(java.sql.Time timeCol) { this.timeCol = timeCol; }

	public java.sql.Date getDateCol() { return dateCol; }
	public void setDateCol(java.sql.Date dateCol) { this.dateCol = dateCol; }

	public java.sql.Timestamp getTimestampCol() { return timestampCol; }
	public void setTimestampCol(java.sql.Timestamp timestampCol) { this.timestampCol = timestampCol; }
	
	private byte[] binaryCol;
	private byte[] blobCol;
	private Object otherCol;
	private byte[] uuidCol;

	public byte[] getBinaryCol() { return binaryCol; }
	public void setBinaryCol(byte[] binaryCol) { this.binaryCol = binaryCol; }

	public byte[] getBlobCol() { return blobCol; }
	public void setBlobCol(byte[] blobCol) { this.blobCol = blobCol; }

	public Object getOtherCol() { return otherCol; }
	public void setOtherCol(Object otherCol) { this.otherCol = otherCol; }
	
	public byte[] getUuidCol() { return uuidCol; }
	public void setUuidCol(byte[] uuidCol) { this.uuidCol = uuidCol; }
	
	private String varcharCol;
	private String varcharIgnorecaseCol;
	private String charCol;
	private String clobCol;

	public String getVarcharCol() { return varcharCol; }
	public void setVarcharCol(String varcharCol) { this.varcharCol = varcharCol; }

	public String getVarcharIgnorecaseCol() { return varcharIgnorecaseCol; }
	public void setVarcharIgnorecaseCol(String varcharIgnorecaseCol) { this.varcharIgnorecaseCol = varcharIgnorecaseCol; }

	public String getCharCol() { return charCol; }
	public void setCharCol(String charCol) { this.charCol = charCol; }

	public String getClobCol() { return clobCol; }
	public void setClobCol(String clobCol) { this.clobCol = clobCol; }
	
	private long id;

	@Column(autoGenerated=true)
	public long getId() { return id; }
	public void setId(long id) { this.id = id; }

}
