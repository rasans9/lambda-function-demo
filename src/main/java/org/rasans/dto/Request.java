package org.rasans.dto;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class Request {
    private int id;
    private String name;
    private List<Integer> marks;
}
