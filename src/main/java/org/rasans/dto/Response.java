package org.rasans.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Response {
    private int id;
    private String name;
    private double averageMarks;
    private double percentageMarks;
}
