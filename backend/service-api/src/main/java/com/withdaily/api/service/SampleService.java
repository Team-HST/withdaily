package com.withdaily.api.service;

import com.withdaily.core.model.Sample;
import org.springframework.stereotype.Service;

/**
 * @author dlgusrb0808@gmail.com
 */
@Service
public class SampleService {

	public Sample getSample() {
		return new Sample();
	}

}
