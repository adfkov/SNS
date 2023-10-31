package com.sns.test.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity
@Builder
@Table(name="sns_230619_user")
public class UserEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY);
	
	
}
