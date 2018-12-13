package pkgTest;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgCore.Retirement;

public class RetirementTest {

	
	@Test
	public void TestPV() {
		int iYearsRetired =20;
		double dAnnualReturn= 0.02;
		double dExpectedPV=  -1454485.55;
		double dRequiredIncome= 10000;
		double dSSIAmt = 2462;
		
		Retirement rt = new Retirement();
		rt.setdAnnualReturnRetired(dAnnualReturn);
		rt.setdMonthlySSI(dSSIAmt);
		rt.setdRequiredIncome(dRequiredIncome);
		rt.setiYearsRetired(iYearsRetired);
		
		assertEquals(dExpectedPV,rt.TotalAmountSaved(),0.01);
	}
	
	@Test
	public void TestPMT() {
		int iYearsWorked = 40;
		double dAnnualReturn = .07;
		double dExpectedPMT = 554.13;
		
		Retirement rt = new Retirement();
		rt.setiYearsToWork(iYearsWorked);
		rt.setdAnnualReturnWorking(dAnnualReturn);
		
		assertEquals(dExpectedPMT, rt.AmountToSave(), 0.01);
	}

}
