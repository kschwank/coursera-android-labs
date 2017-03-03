BASE_DIR = ..
EXERCISE_DIR = $(BASE_DIR)
TARGET_DIR = UILabSubmit
SUBMISSION_ZIP = UserInterfaceLabSubmit.zip

default: clean all

submission: clean all
	zip -r $(SUBMISSION_ZIP) $(TARGET_DIR)

all: uilab

uilab:
	mkdir -p $(TARGET_DIR)/UILab
	cp $(EXERCISE_DIR)/Lab4_UILabs/src/course/labs/todomanager/AddToDoActivity.java $(TARGET_DIR)/UILab/
	cp $(EXERCISE_DIR)/Lab4_UILabs/src/course/labs/todomanager/ToDoListAdapter.java $(TARGET_DIR)/UILab/
	cp $(EXERCISE_DIR)/Lab4_UILabs/src/course/labs/todomanager/ToDoManagerActivity.java $(TARGET_DIR)/UILab/

clean:
	rm -rf $(TARGET_DIR)
	rm -f $(SUBMISSION_ZIP)

