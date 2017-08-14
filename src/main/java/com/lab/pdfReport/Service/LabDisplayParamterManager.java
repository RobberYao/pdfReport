package com.lab.pdfReport.Service;

import java.sql.ResultSet;
import java.util.Date;

import com.lab.pdfReport.Model.LabDisplayConditions;
import com.lab.pdfReport.Model.LabDisplayParamter;

public interface LabDisplayParamterManager {

	LabDisplayConditions getLabDisplayConditions(String disProbeNumber, Date createdTime, Date stopTime)
			throws Exception;

}
