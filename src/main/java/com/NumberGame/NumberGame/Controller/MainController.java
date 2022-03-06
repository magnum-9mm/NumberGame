package com.NumberGame.NumberGame.Controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@RequestMapping("enterdigit")
	public @ResponseBody ArrayList<Integer> enterNumber(@RequestParam Integer n, @RequestParam String direction) {

		ArrayList<Integer> arrayList = new ArrayList<Integer>();

		Random rand = new Random();
			arrayList.add(rand.nextInt(1000));
		}
		System.out.println(direction);
		if (direction.equals("ascend")) {
			Collections.sort(arrayList);
		} else {
			Collections.sort(arrayList, Collections.reverseOrder());
		}
		System.out.println(arrayList);

		return arrayList;

	}

}
