package com.envisioncn.it.super_sonic.showcase.evaluation.biz;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.envisioncn.it.super_sonic.showcase.evaluation.entity.AssessmentCycles;
import com.envisioncn.it.super_sonic.showcase.evaluation.mapper.AssessmentCyclesMapper;

@Service
public class AssessmentCyclesService {
	
	@Autowired
	private AssessmentCyclesMapper assessmentCyclesMapper;
	
	  /*
	    * 根据周期id查询周期(横向)
	    */
		public AssessmentCycles getAssessmentPeriod(String cycleId) {
			Objects.requireNonNull(cycleId);
			
			List<AssessmentCycles> list = assessmentCyclesMapper.getAssessmentPeriod(cycleId);
			return list.isEmpty() ? null : list.get(0);
		}
}
