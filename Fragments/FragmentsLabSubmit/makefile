BASE_DIR = ..
EXERCISE_DIR = $(BASE_DIR)
TARGET_DIR = FragmentsLabSubmit
SUBMISSION_ZIP = FragmentsLabSubmit.zip

default: clean all

submission: clean all
	zip -r $(SUBMISSION_ZIP) $(TARGET_DIR)

all: fragmentslab

fragmentslab:
	mkdir -p $(TARGET_DIR)/FragmentsLab
	cp $(EXERCISE_DIR)/Lab3c_FragmentsLab/src/course/labs/fragmentslab/MainActivity.java $(TARGET_DIR)/FragmentsLab/

clean:
	rm -rf $(TARGET_DIR)
	rm -f $(SUBMISSION_ZIP)

