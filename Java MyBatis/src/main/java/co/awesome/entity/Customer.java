package co.awesome.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Customer {
	private Integer id;
	private String name;
	private String city;
	private String email;
	private String phone;
}
