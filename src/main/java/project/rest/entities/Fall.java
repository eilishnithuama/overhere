package project.rest.entities;


import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "Fall")
public class Fall implements Serializable {
	
	private static final long serialVersionUID = -3009157732242241606L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
	@Column(name="X_AXIS")
    private double xaxis;
	@Column(name="Y_AXIS")
    private double yaxis;
	@Column(name="Z_AXIS")
    private double zaxis;
	
	@Column(name="TIMESTAMP")
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss.SSS")
    private Date timestamp;

	public Fall()
	{
		
	}
	
	public Fall(double xaxis)
	{
		this.xaxis = xaxis;
	}
	
    public Fall(int id, double xaxis) {
		super();
		this.id = id;
		this.xaxis = xaxis;
	}

	public int getId() {
        return this.id;
    }

	public double getXaxis() {
        return this.xaxis;
    }

	public double getYaxis() {
		return yaxis;
	}

	public void setYaxis(double yaxis) {
		this.yaxis = yaxis;
	}

	public double getZaxis() {
		return zaxis;
	}

	public void setZaxis(double zaxis) {
		this.zaxis = zaxis;
	}
	
    @Override
	public String toString() {
		return "Fall [id=" + id + ", xaxis=" + xaxis + "]";
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	

}
