/*
 * Copyright (C) WorkFusion 2018. All rights reserved.
 */
package com.workfusion.lab.lesson9.run;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.workfusion.lab.lesson9.model.Assignment2Model;
import com.workfusion.vds.sdk.api.nlp.configuration.FieldInfo;
import com.workfusion.vds.sdk.run.ModelRunner;
import com.workfusion.vds.sdk.run.config.LocalTrainingConfiguration;

/**
 * This runner allows you to start model training on your local machine.
 * Paths to training set and output folders, fields configuration are required for the lauch.
 */
public class Assignment2ModelTrainingRunner {

    /**
     * Input directory path to use.
     */
    private final static String INPUT_DIR_PATH = "data/train";

    /**
     * Output directory path to use.
     */
    public final static String OUTPUT_DIR_PATH = "results_assignment2";

    public static void main(String[] args) throws Exception {
        System.setProperty("WORKFLOW_LOG_FOLDER", "./logs/");

        //TODO Configure input/output
        Path inputDirPath = Paths.get("PUT YOUR PATH HERE");
        Path outputDirPath = Paths.get("PUT YOUR PATH HERE");

        //TODO Configure fields according to your use-case
        List<FieldInfo> fields = new ArrayList<>();
        // TODO:  PUT YOU CODE HERE

        //TODO add parameters if needed.
        Map<String, Object> parameters = new HashMap<>();

        LocalTrainingConfiguration configuration = LocalTrainingConfiguration.builder()
                .inputDir(inputDirPath)
                .outputDir(outputDirPath)
                .fields(fields)
                .parameters(parameters)
                .build();

        ModelRunner.run(Assignment2Model.class, configuration);
    }

}