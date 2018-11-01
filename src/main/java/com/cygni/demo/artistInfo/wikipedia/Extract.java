package com.cygni.demo.artistInfo.wikipedia;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Extract implements Serializable {
    private String extract;
}
