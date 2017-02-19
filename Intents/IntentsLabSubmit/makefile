BASE_DIR = ..
EXERCISE_DIR = $(BASE_DIR)
TARGET_DIR = IntentsLabSubmit
SUBMISSION_ZIP = IntentsLabSubmit.zip

default: clean all

submission: clean all
	zip -r $(SUBMISSION_ZIP) $(TARGET_DIR)

all: intentslab mybrowser

intentslab:
	mkdir -p $(TARGET_DIR)/IntentsLab
	cp $(EXERCISE_DIR)/Lab3a_IntentsLab/src/course/labs/intentslab/ActivityLoaderActivity.java $(TARGET_DIR)/IntentsLab/
	cp $(EXERCISE_DIR)/Lab3a_IntentsLab/src/course/labs/intentslab/ExplicitlyLoadedActivity.java $(TARGET_DIR)/IntentsLab/

mybrowser:
	mkdir -p $(TARGET_DIR)/MyBrowser
	cp $(EXERCISE_DIR)/Lab3a_MyBrowser/AndroidManifest.xml $(TARGET_DIR)/MyBrowser/

clean:
	rm -rf $(TARGET_DIR)
	rm -f $(SUBMISSION_ZIP)

