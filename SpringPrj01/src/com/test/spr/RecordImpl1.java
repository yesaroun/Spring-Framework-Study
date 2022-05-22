/*================================
	RecordImpl1.java
	- 클래스
	- Record 인터페이스를 구현하는 클래스
================================*/

package com.test.spr;

public class RecordImpl1 implements Record
{
	// 주요 속성 구성
	private int kor, eng, mat;

	@Override
	public void setKor(int kor)
	{
		// TODO Auto-generated method stub
		this.kor = kor;
	}

	@Override
	public int getKor()
	{
		// TODO Auto-generated method stub
		return kor;
	}

	@Override
	public void setEng(int eng)
	{
		// TODO Auto-generated method stub
		this.eng = eng;
	}

	@Override
	public int getEng()
	{
		// TODO Auto-generated method stub
		return eng;
	}

	@Override
	public void setMat(int mat)
	{
		// TODO Auto-generated method stub
		this.mat = mat;
	}

	@Override
	public int getMat()
	{
		// TODO Auto-generated method stub
		return mat;
	}

	@Override
	public int getTotal()
	{
		// TODO Auto-generated method stub
		int result = 0;
		
		result = this.getKor() + this.getEng() + this.getMat();
		
		return result;
	}

	@Override
	public double getAvg()
	{
		// TODO Auto-generated method stub
		double result = 0;
		
		result = this.getTotal() / 3.0;
		
		return result;
	}
	
}
