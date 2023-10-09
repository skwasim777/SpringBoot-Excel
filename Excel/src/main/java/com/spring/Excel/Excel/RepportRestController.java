package com.spring.Excel.Excel;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletResponse;

@RestController
public class RepportRestController {
		@Autowired
		private ReportSrevice repoSrevice;
		@GetMapping("/excel")
		public void generateExcelReport(HttpServletResponse response) throws IOException {
				response.setContentType("application/octect-stream");
				String headerkey="Content-Disposition";
				String headerValue="attachment;filename=courses.xls";
				response.setHeader(headerkey, headerValue);
				repoSrevice.generateExcel(response);
		}
}
